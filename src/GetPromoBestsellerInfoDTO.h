/*
 * GetPromoBestsellerInfoDTO.h
 *
 * Информация об акции «Бестселлеры Маркета».
 */

#ifndef _GetPromoBestsellerInfoDTO_H_
#define _GetPromoBestsellerInfoDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об акции «Бестселлеры Маркета».
 *
 *  \ingroup Models
 *
 */

class GetPromoBestsellerInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoBestsellerInfoDTO();
	GetPromoBestsellerInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoBestsellerInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
	 */
	bool getBestseller();

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
	bool bestseller;
	std::string entryDeadline;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoBestsellerInfoDTO_H_ */
