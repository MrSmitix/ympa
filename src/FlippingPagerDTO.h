/*
 * FlippingPagerDTO.h
 *
 * Модель для пагинации.
 */

#ifndef _FlippingPagerDTO_H_
#define _FlippingPagerDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Модель для пагинации.
 *
 *  \ingroup Models
 *
 */

class FlippingPagerDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FlippingPagerDTO();
	FlippingPagerDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FlippingPagerDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Сколько всего найдено элементов.
	 */
	int getTotal();

	/*! \brief Set Сколько всего найдено элементов.
	 */
	void setTotal(int  total);
	/*! \brief Get Начальный номер найденного элемента на странице.
	 */
	int getFrom();

	/*! \brief Set Начальный номер найденного элемента на странице.
	 */
	void setFrom(int  from);
	/*! \brief Get Конечный номер найденного элемента на странице.
	 */
	int getTo();

	/*! \brief Set Конечный номер найденного элемента на странице.
	 */
	void setTo(int  to);
	/*! \brief Get Текущая страница.
	 */
	int getCurrentPage();

	/*! \brief Set Текущая страница.
	 */
	void setCurrentPage(int  currentPage);
	/*! \brief Get Общее количество страниц.
	 */
	int getPagesCount();

	/*! \brief Set Общее количество страниц.
	 */
	void setPagesCount(int  pagesCount);
	/*! \brief Get Размер страницы.
	 */
	int getPageSize();

	/*! \brief Set Размер страницы.
	 */
	void setPageSize(int  pageSize);

private:
	int total;
	int from;
	int to;
	int currentPage;
	int pagesCount;
	int pageSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FlippingPagerDTO_H_ */
