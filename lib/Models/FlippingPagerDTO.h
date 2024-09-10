
/*
 * FlippingPagerDTO.h
 *
 * Модель для пагинации.
 */

#ifndef TINY_CPP_CLIENT_FlippingPagerDTO_H_
#define TINY_CPP_CLIENT_FlippingPagerDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Модель для пагинации.
 *
 *  \ingroup Models
 *
 */

class FlippingPagerDTO{
public:

    /*! \brief Constructor.
	 */
    FlippingPagerDTO();
    FlippingPagerDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FlippingPagerDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int total{};
    int from{};
    int to{};
    int currentPage{};
    int pagesCount{};
    int pageSize{};
};
}

#endif /* TINY_CPP_CLIENT_FlippingPagerDTO_H_ */
