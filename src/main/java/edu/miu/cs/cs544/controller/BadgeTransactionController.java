package edu.miu.cs.cs544.controller;

import edu.miu.cs.cs544.contract.BadgeTransactionDTO;
import edu.miu.cs.cs544.model.BadgeTransaction;
import edu.miu.cs.cs544.service.BadgeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class BadgeTransactionController {

    @Autowired
    private BadgeTransactionService badgeTransactionService;




    @GetMapping("/{memberId}")
    public Optional<List<BadgeTransaction>> findAllBadgeTransactionByMemberId(@PathVariable int memberId) {
        return badgeTransactionService.findAllBadgeTransactionByMemberId(memberId);
    }

    @PostMapping
    public void addOneTransaction(@RequestBody BadgeTransactionDTO badgeTransaction) {
        badgeTransactionService.generateBadgeTransaction(badgeTransaction);
    }


}
