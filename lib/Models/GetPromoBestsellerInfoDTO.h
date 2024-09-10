
/*
 * GetPromoBestsellerInfoDTO.h
 *
 * Информация об акции «Бестселлеры Маркета».
 */

#ifndef TINY_CPP_CLIENT_GetPromoBestsellerInfoDTO_H_
#define TINY_CPP_CLIENT_GetPromoBestsellerInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация об акции «Бестселлеры Маркета».
 *
 *  \ingroup Models
 *
 */

class GetPromoBestsellerInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoBestsellerInfoDTO();
    GetPromoBestsellerInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoBestsellerInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
	 */
	bool isBestseller();

	/*! \brief Set Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
	 */
	void setBestseller(bool  bestseller);
	/*! \brief Get До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
	 */
	std::string getEntryDeadline();

	/*! \brief Set До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
	 */
	void setEntryDeadline(std::string  entryDeadline);


    private:
    bool bestseller{};
    std::string entryDeadline{};
};
}

#endif /* TINY_CPP_CLIENT_GetPromoBestsellerInfoDTO_H_ */
