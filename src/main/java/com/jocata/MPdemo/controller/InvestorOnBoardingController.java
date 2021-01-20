package com.jocata.MPdemo.controller;

import com.jocata.MPdemo.vo.investoronboarding.InvestorOnBoardingVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestorOnBoardingController {

    @PostMapping(path = "/investor/onboarding", consumes = "application/json", produces = "application/json")
    public InvestorOnBoardingVO onBoarding(@RequestBody InvestorOnBoardingVO investorOnBoardingVO){
        return investorOnBoardingVO;
    }

}
