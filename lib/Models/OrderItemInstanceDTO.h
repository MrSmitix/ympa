
/*
 * OrderItemInstanceDTO.h
 *
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemInstanceDTO_H_
#define TINY_CPP_CLIENT_OrderItemInstanceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 *
 *  \ingroup Models
 *
 */

class OrderItemInstanceDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemInstanceDTO();
    OrderItemInstanceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemInstanceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string cis{};
    std::string cisFull{};
    std::string uin{};
    std::string rnpt{};
    std::string gtd{};
};
}

#endif /* TINY_CPP_CLIENT_OrderItemInstanceDTO_H_ */
