/*
 * OrderLabelDTO.h
 *
 * Данные для печати ярлыка.
 */

#ifndef _OrderLabelDTO_H_
#define _OrderLabelDTO_H_


#include <string>
#include "ParcelBoxLabelDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные для печати ярлыка.
 *
 *  \ingroup Models
 *
 */

class OrderLabelDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLabelDTO();
	OrderLabelDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLabelDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long long  orderId);
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
	long long orderId;
	int placesNumber;
	std::string url;
	std::list <ParcelBoxLabelDTO>parcelBoxLabels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLabelDTO_H_ */
