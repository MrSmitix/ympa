/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIOutletWorkingScheduleDTO.h
 *
 * Список режимов работы точки продаж. 
 */

#ifndef OAIOutletWorkingScheduleDTO_H
#define OAIOutletWorkingScheduleDTO_H

#include <QJsonObject>

#include "OAIOutletWorkingScheduleItemDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOutletWorkingScheduleDTO : public OAIObject {
public:
    OAIOutletWorkingScheduleDTO();
    OAIOutletWorkingScheduleDTO(QString json);
    ~OAIOutletWorkingScheduleDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    bool isWorkInHoliday() const;
    void setWorkInHoliday(const bool &work_in_holiday);
    bool is_work_in_holiday_Set() const;
    bool is_work_in_holiday_Valid() const;

    QList<OAIOutletWorkingScheduleItemDTO> getScheduleItems() const;
    void setScheduleItems(const QList<OAIOutletWorkingScheduleItemDTO> &schedule_items);
    bool is_schedule_items_Set() const;
    bool is_schedule_items_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    bool work_in_holiday;
    bool m_work_in_holiday_isSet;
    bool m_work_in_holiday_isValid;

    QList<OAIOutletWorkingScheduleItemDTO> schedule_items;
    bool m_schedule_items_isSet;
    bool m_schedule_items_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOutletWorkingScheduleDTO)

#endif // OAIOutletWorkingScheduleDTO_H
