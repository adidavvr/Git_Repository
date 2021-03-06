package com.hrms.model;
// Generated Dec 16, 2016 10:52:21 AM by Hibernate Tools 4.3.1



/**
 * DeductionRules generated by hbm2java
 */
public class DeductionRules  implements java.io.Serializable {


     private int deductionRuleId;
     private String empGrade;
     private Integer flatDeductionAmount;
     private Float basicRate;

    public DeductionRules() {
    }

	
    public DeductionRules(int deductionRuleId) {
        this.deductionRuleId = deductionRuleId;
    }
    public DeductionRules(int deductionRuleId, String empGrade, Integer flatDeductionAmount, Float basicRate) {
       this.deductionRuleId = deductionRuleId;
       this.empGrade = empGrade;
       this.flatDeductionAmount = flatDeductionAmount;
       this.basicRate = basicRate;
    }
   
    public int getDeductionRuleId() {
        return this.deductionRuleId;
    }
    
    public void setDeductionRuleId(int deductionRuleId) {
        this.deductionRuleId = deductionRuleId;
    }
    public String getEmpGrade() {
        return this.empGrade;
    }
    
    public void setEmpGrade(String empGrade) {
        this.empGrade = empGrade;
    }
    public Integer getFlatDeductionAmount() {
        return this.flatDeductionAmount;
    }
    
    public void setFlatDeductionAmount(Integer flatDeductionAmount) {
        this.flatDeductionAmount = flatDeductionAmount;
    }
    public Float getBasicRate() {
        return this.basicRate;
    }
    
    public void setBasicRate(Float basicRate) {
        this.basicRate = basicRate;
    }




}


