public class Bill {
    private Integer billId;
    private Integer ammount;

    public Bill(Integer billId, Integer ammount) {
        this.billId = billId;
        this.ammount = ammount;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }
}
