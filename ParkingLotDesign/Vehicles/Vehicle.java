package ParkingLotDesign.Vehicles;

public abstract class Vehicle {

    private Double rate;
    private String vehicleNo;
    private String vehicleType;

    Vehicle(String no, String type, Double rate) {
        this.vehicleNo = no;
        this.vehicleType = type;
        this.rate = rate;
    }

    public Double getRate(){
        return rate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rate == null) ? 0 : rate.hashCode());
        result = prime * result + ((vehicleNo == null) ? 0 : vehicleNo.hashCode());
        result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (rate == null) {
            if (other.rate != null)
                return false;
        } else if (!rate.equals(other.rate))
            return false;
        if (vehicleNo == null) {
            if (other.vehicleNo != null)
                return false;
        } else if (!vehicleNo.equals(other.vehicleNo))
            return false;
        if (vehicleType == null) {
            if (other.vehicleType != null)
                return false;
        } else if (!vehicleType.equals(other.vehicleType))
            return false;
        return true;
    }

    

}