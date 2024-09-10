
/*
 * ProvideOrderDigitalCodesRequest.h
 *
 * Запрос на передачу ключей цифровых товаров.
 */

#ifndef TINY_CPP_CLIENT_ProvideOrderDigitalCodesRequest_H_
#define TINY_CPP_CLIENT_ProvideOrderDigitalCodesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderDigitalItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на передачу ключей цифровых товаров.
 *
 *  \ingroup Models
 *
 */

class ProvideOrderDigitalCodesRequest{
public:

    /*! \brief Constructor.
	 */
    ProvideOrderDigitalCodesRequest();
    ProvideOrderDigitalCodesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProvideOrderDigitalCodesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
	 */
	std::list<OrderDigitalItemDTO> getItems();

	/*! \brief Set Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
	 */
	void setItems(std::list <OrderDigitalItemDTO> items);


    private:
    std::list<OrderDigitalItemDTO> items;
};
}

#endif /* TINY_CPP_CLIENT_ProvideOrderDigitalCodesRequest_H_ */
