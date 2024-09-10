
/*
 * BriefOrderItemInstanceDTO.h
 *
 * Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 */

#ifndef TINY_CPP_CLIENT_BriefOrderItemInstanceDTO_H_
#define TINY_CPP_CLIENT_BriefOrderItemInstanceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
 *
 *  \ingroup Models
 *
 */

class BriefOrderItemInstanceDTO{
public:

    /*! \brief Constructor.
	 */
    BriefOrderItemInstanceDTO();
    BriefOrderItemInstanceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BriefOrderItemInstanceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
	 */
	std::string getCis();

	/*! \brief Set Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
	 */
	void setCis(std::string  cis);
	/*! \brief Get Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
	 */
	std::string getUin();

	/*! \brief Set Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
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
    std::string uin{};
    std::string rnpt{};
    std::string gtd{};
};
}

#endif /* TINY_CPP_CLIENT_BriefOrderItemInstanceDTO_H_ */
