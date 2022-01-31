/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDateTime;

/**
 *
 * @author rofat
 */
public class BloodDonation {
    private LocalDateTime donatedDate;
    private String donorEmail;
    private String donatedAt;
    private String availableDate;
    private String status;
    private String remark;

    public LocalDateTime getDonatedDate() {
        return donatedDate;
    }

    public void setDonatedDate(LocalDateTime donatedDate) {
        this.donatedDate = donatedDate;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public String getDonatedAt() {
        return donatedAt;
    }

    public void setDonatedAt(String donatedAt) {
        this.donatedAt = donatedAt;
    }

    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BloodDonation{" +
                "donatedDate=" + donatedDate +
                ", donorEmail='" + donorEmail + '\'' +
                ", donatedAt='" + donatedAt + '\'' +
                ", availableDate='" + availableDate + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
