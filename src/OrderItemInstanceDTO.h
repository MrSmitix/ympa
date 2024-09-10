/*
 * OrderItemInstanceDTO.h
 *
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */

#ifndef _OrderItemInstanceDTO_H_
#define _OrderItemInstanceDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 *
 *  \ingroup Models
 *
 */

class OrderItemInstanceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemInstanceDTO();
	OrderItemInstanceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemInstanceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
	 */
	std::string getCis();

	/*! \brief Set Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
	 */
	void setCis(std::string  cis);
	/*! \brief Get Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
	 */
	std::string getCisFull();

	/*! \brief Set Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
	 */
	void setCisFull(std::string  cisFull);
	/*! \brief Get УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
	 */
	std::string getUin();

	/*! \brief Set УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
	 */
	void setUin(std::string  uin);
	/*! \brief Get Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
	 */
	std::string getRnpt();

	/*! \brief Set Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
	 */
	void setRnpt(std::string  rnpt);
	/*! \brief Get Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
	 */
	std::string getGtd();

	/*! \brief Set Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
	 */
	void setGtd(std::string  gtd);

private:
	std::string cis;
	std::string cisFull;
	std::string uin;
	std::string rnpt;
	std::string gtd;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemInstanceDTO_H_ */
