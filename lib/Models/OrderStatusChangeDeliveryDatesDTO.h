
/*
 * OrderStatusChangeDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef TINY_CPP_CLIENT_OrderStatusChangeDeliveryDatesDTO_H_
#define TINY_CPP_CLIENT_OrderStatusChangeDeliveryDatesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Диапазон дат доставки.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDeliveryDatesDTO{
public:

    /*! \brief Constructor.
	 */
    OrderStatusChangeDeliveryDatesDTO();
    OrderStatusChangeDeliveryDatesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderStatusChangeDeliveryDatesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
	 */
	Date getRealDeliveryDate();

	/*! \brief Set **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
	 */
	void setRealDeliveryDate(Date  realDeliveryDate);


    private:
    Date realDeliveryDate;
};
}

#endif /* TINY_CPP_CLIENT_OrderStatusChangeDeliveryDatesDTO_H_ */
