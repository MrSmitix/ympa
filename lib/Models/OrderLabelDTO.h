
/*
 * OrderLabelDTO.h
 *
 * Данные для печати ярлыка.
 */

#ifndef TINY_CPP_CLIENT_OrderLabelDTO_H_
#define TINY_CPP_CLIENT_OrderLabelDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ParcelBoxLabelDTO.h"
#include <list>

namespace Tiny {


/*! \brief Данные для печати ярлыка.
 *
 *  \ingroup Models
 *
 */

class OrderLabelDTO{
public:

    /*! \brief Constructor.
	 */
    OrderLabelDTO();
    OrderLabelDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLabelDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор заказа.
	 */
	long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long  orderId);
	/*! \brief Get Количество коробок в заказе.
	 */
	int getPlacesNumber();

	/*! \brief Set Количество коробок в заказе.
	 */
	void setPlacesNumber(int  placesNumber);
	/*! \brief Get URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
	 */
	std::string getUrl();

	/*! \brief Set URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
	 */
	void setUrl(std::string  url);
	/*! \brief Get Информация на ярлыке.
	 */
	std::list<ParcelBoxLabelDTO> getParcelBoxLabels();

	/*! \brief Set Информация на ярлыке.
	 */
	void setParcelBoxLabels(std::list <ParcelBoxLabelDTO> parcelBoxLabels);


    private:
    long orderId{};
    int placesNumber{};
    std::string url{};
    std::list<ParcelBoxLabelDTO> parcelBoxLabels;
};
}

#endif /* TINY_CPP_CLIENT_OrderLabelDTO_H_ */
