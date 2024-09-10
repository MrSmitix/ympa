package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.LicenseType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о лицензии.
 */
public class OutletLicenseDTO   {

    private Long id;
    private Long outletId;
    private LicenseType licenseType;
    private String number;
    private OffsetDateTime dateOfIssue;
    private OffsetDateTime dateOfExpiry;

    /**
     * Default constructor.
     */
    public OutletLicenseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletLicenseDTO.
     *
     * @param id Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. 
     * @param outletId Идентификатор точки продаж, для которой действительна лицензия.
     * @param licenseType licenseType
     * @param number Номер лицензии.
     * @param dateOfIssue Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. 
     * @param dateOfExpiry Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. 
     */
    public OutletLicenseDTO(
        Long id, 
        Long outletId, 
        LicenseType licenseType, 
        String number, 
        OffsetDateTime dateOfIssue, 
        OffsetDateTime dateOfExpiry
    ) {
        this.id = id;
        this.outletId = outletId;
        this.licenseType = licenseType;
        this.number = number;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
    }



    /**
     * Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Идентификатор точки продаж, для которой действительна лицензия.
     * @return outletId
     */
    public Long getOutletId() {
        return outletId;
    }

    public void setOutletId(Long outletId) {
        this.outletId = outletId;
    }

    /**
     * Get licenseType
     * @return licenseType
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Номер лицензии.
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
     * @return dateOfIssue
     */
    public OffsetDateTime getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(OffsetDateTime dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /**
     * Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
     * @return dateOfExpiry
     */
    public OffsetDateTime getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(OffsetDateTime dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutletLicenseDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
        sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
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

