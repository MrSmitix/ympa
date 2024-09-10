
/*
 * CategoryContentParametersDTO.h
 *
 * Информация о параметрах категории.
 */

#ifndef TINY_CPP_CLIENT_CategoryContentParametersDTO_H_
#define TINY_CPP_CLIENT_CategoryContentParametersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CategoryParameterDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о параметрах категории.
 *
 *  \ingroup Models
 *
 */

class CategoryContentParametersDTO{
public:

    /*! \brief Constructor.
	 */
    CategoryContentParametersDTO();
    CategoryContentParametersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryContentParametersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
	 */
	int getCategoryId();

	/*! \brief Set Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
	 */
	void setCategoryId(int  categoryId);
	/*! \brief Get Список характеристик.
	 */
	std::list<CategoryParameterDTO> getParameters();

	/*! \brief Set Список характеристик.
	 */
	void setParameters(std::list <CategoryParameterDTO> parameters);


    private:
    int categoryId{};
    std::list<CategoryParameterDTO> parameters;
};
}

#endif /* TINY_CPP_CLIENT_CategoryContentParametersDTO_H_ */
