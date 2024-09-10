package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о курьере.
 */
public class OrderCourierDTO   {

    private String fullName;
    private String phone;
    private String phoneExtension;
    private String vehicleNumber;
    private String vehicleDescription;

    /**
     * Default constructor.
     */
    public OrderCourierDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderCourierDTO.
     *
     * @param fullName Полное имя курьера.
     * @param phone Номер телефона курьера.
     * @param phoneExtension Добавочный номер телефона.
     * @param vehicleNumber Номер транспортного средства.
     * @param vehicleDescription Описание машины. Например, модель и цвет.
     */
    public OrderCourierDTO(
        String fullName, 
        String phone, 
        String phoneExtension, 
        String vehicleNumber, 
        String vehicleDescription
    ) {
        this.fullName = fullName;
        this.phone = phone;
        this.phoneExtension = phoneExtension;
        this.vehicleNumber = vehicleNumber;
        this.vehicleDescription = vehicleDescription;
    }



    /**
     * Полное имя курьера.
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Номер телефона курьера.
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Добавочный номер телефона.
     * @return phoneExtension
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    /**
     * Номер транспортного средства.
     * @return vehicleNumber
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /**
     * Описание машины. Например, модель и цвет.
     * @return vehicleDescription
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderCourierDTO {\n");
        
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
        sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
        sb.append("    vehicleDescription: ").append(toIndentedString(vehicleDescription)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

