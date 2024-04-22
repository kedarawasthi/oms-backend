package com.dev.controller;

import com.dev.dto.purchaseorder.Purchaseorder;
import com.dev.dto.returnorder.Returnorder;
import com.dev.dto.salesorder.Salesorder;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.logging.Logger;

@CrossOrigin("http://localhost:8081")
@RestController
@RequestMapping("/api")
public class OrderController {

    Logger logger = Logger.getLogger(OrderController.class.getName());
    @PostMapping("/customer")
    public ResponseEntity<String> placeSalesOrder(@Valid @RequestBody Salesorder salesorder, @RequestHeader Map<String,String> headers) {
        logger.info("Receieved salesorder message, correlationId: "+ headers.get("x-correlation-id"));
        return new ResponseEntity<>("salesorder extended to customer service successfully", HttpStatus.CREATED);
    }

    @PostMapping("/item-ext")
    public ResponseEntity<String> placeReturnOrder(@Valid @RequestBody Returnorder returnorder,@RequestHeader Map<String,String> headers) {
        logger.info("Receieved returnorder message, correlationId: " + headers.get("x-correlation-id"));
        return new ResponseEntity<>("returnorder initiated to downstream systems successfully", HttpStatus.CREATED);
    }

    @PostMapping("/product")
    public ResponseEntity<String> placePurchaseOrderToProductService(@Valid @RequestBody Purchaseorder purchaseorder,@RequestHeader Map<String,String> headers) {
        logger.info("Receieved purchaseorder message for product inventory update,correlationId: " + headers.get("x-correlation-id"));
        return new ResponseEntity<>("purchaseorder sent to product inventory successfully", HttpStatus.CREATED);
    }

    @PostMapping("/shipping")
    public ResponseEntity<String> placePurchaseOrderToShippingService(@Valid @RequestBody Purchaseorder purchaseorder,@RequestHeader Map<String,String> headers) {
        logger.info("Receieved purchaseorder message for shipping,correaltionId: " + headers.get("x-correlation-id"));
        return new ResponseEntity<>("purchaseorder sent to shipping service successfully", HttpStatus.CREATED);
    }
}
