package com.dev.controller;

import com.dev.dto.purchaseorder.Purchaseorder;
import com.dev.dto.returnorder.Returnorder;
import com.dev.dto.salesorder.Salesorder;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@CrossOrigin("http://localhost:8081")
@RestController
@RequestMapping("/api")
public class OrderController {

    Logger logger = Logger.getLogger(OrderController.class.getName());
    @PostMapping("/customer")
    public ResponseEntity<String> placeSalesOrder(@Valid @RequestBody Salesorder salesorder) {
        logger.info("Receieved salesorder message");
        return new ResponseEntity<>("salesorder extended to customer service successfully", HttpStatus.CREATED);
    }

    @PostMapping("/item-ext")
    public ResponseEntity<String> placeReturnOrder(@Valid @RequestBody Returnorder returnorder) {
        logger.info("Receieved returnorder message");
        return new ResponseEntity<>("returnorder initiated to downstream systems successfully", HttpStatus.CREATED);
    }

    @PostMapping("/product")
    public ResponseEntity<String> placePurchaseOrderToProductService(@Valid @RequestBody Purchaseorder purchaseorder) {
        logger.info("Receieved purchaseorder message for product inventory update");
        return new ResponseEntity<>("purchaseorder sent to product inventory successfully", HttpStatus.CREATED);
    }

    @PostMapping("/shipping")
    public ResponseEntity<String> placePurchaseOrderToShippingService(@Valid @RequestBody Purchaseorder purchaseorder) {
        logger.info("Receieved purchaseorder message for shipping");
        return new ResponseEntity<>("purchaseorder sent to shipping service successfully", HttpStatus.CREATED);
    }

}
