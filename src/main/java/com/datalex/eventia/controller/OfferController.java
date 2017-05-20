package com.datalex.eventia.controller;

import com.datalex.eventia.domain.Offer;
import com.datalex.eventia.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shaojie.xu on 20/05/2017.
 */
@RestController
public class OfferController {

    @Autowired
    OfferService offerService;

    @RequestMapping(value = "/offer/{even_id}/{origin}", method = RequestMethod.GET)
    @ResponseStatus( HttpStatus.OK )
    public Offer findOffer(@PathVariable( "origin" ) String origin, @PathVariable( "even_id" ) String eventId){
        return offerService.getBestOffer(origin, eventId);
    }
}
