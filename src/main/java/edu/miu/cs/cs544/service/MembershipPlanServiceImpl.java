package edu.miu.cs.cs544.service;

import edu.miu.cs.cs544.model.Location;
import edu.miu.cs.cs544.model.MembershipPlan;
import edu.miu.cs.cs544.repository.LocationRepository;
import edu.miu.cs.cs544.repository.MembershipPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MembershipPlanServiceImpl implements MembershipPlanService {
    @Autowired
    private MembershipPlanRepository membershipPlanRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public MembershipPlan addOnePlan(MembershipPlan membershipPlan) {
        return membershipPlanRepository.save(membershipPlan);
    }

    @Override
    public MembershipPlan updateOnePlanByPlanId(MembershipPlan membershipPlan) {
        return membershipPlanRepository.save(membershipPlan);
        
    }

    @Override
    public void deleteOnePlan(int planId) {
        membershipPlanRepository.deleteById(planId);
    }

    @Override
    public List<MembershipPlan> findAllMembershipPlanOfMemberByMemberId(int id) {
        return membershipPlanRepository.findAllMembershipPlanOfmemberByMemberId(id);
    }

    @Override
    public Optional<MembershipPlan> getMembershipPlanById(int id) {
        return membershipPlanRepository.findById(id);
    }

    @Override
    public List<Location> findLocationByPlan(Integer planid) {
        return locationRepository.findLocationByPlan(planid);
    }
}



