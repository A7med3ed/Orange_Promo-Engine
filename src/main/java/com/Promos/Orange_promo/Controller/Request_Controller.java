package com.Promos.Orange_promo.Controller;


import org.springframework.ui.Model;
import com.Promos.Orange_promo.BSL.Promo_BL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Promo")
public class Request_Controller {

        private  Promo_BL promoBL;


        public Request_Controller(Promo_BL promoBL) {
            this.promoBL = promoBL;
        }

        @GetMapping
        public String getPromoRequest(@RequestParam int msisdn, @RequestParam int offerid) {

            return promoBL.Flow((long)msisdn,(long)offerid) ;

        }








}
