package dto;

import java.time.LocalDateTime;


public class BloodRequest {
    private String requestEmail;
    private String requestDate;
    private String closeDate;
    private String requestBloodType;
    private String priorityStatus;
    private String requestStatus;
    private String remark;

    public String getRequestEmail() {
        return requestEmail;
    }

    public void setRequestEmail(String requestEmail) {
        this.requestEmail = requestEmail;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getRequestBloodType() {
        return requestBloodType;
    }

    public void setRequestBloodType(String requestBloodType) {
        this.requestBloodType = requestBloodType;
    }

   

    public String getPriorityStatus() {
        return priorityStatus;
    }

    public void setPriorityStatus(String priorityStatus) {
        this.priorityStatus = priorityStatus;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BloodRequest{" +
                "requestEmail='" + requestEmail + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                ", requestBloodType='" + requestBloodType + '\'' +
                ", priorityStatus='" + priorityStatus + '\'' +
                ", requestStatus='" + requestStatus + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
