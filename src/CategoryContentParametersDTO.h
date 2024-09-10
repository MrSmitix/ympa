/*
 * CategoryContentParametersDTO.h
 *
 * Информация о параметрах категории.
 */

#ifndef _CategoryContentParametersDTO_H_
#define _CategoryContentParametersDTO_H_


#include <string>
#include "CategoryParameterDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о параметрах категории.
 *
 *  \ingroup Models
 *
 */

class CategoryContentParametersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CategoryContentParametersDTO();
	CategoryContentParametersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CategoryContentParametersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int categoryId;
	std::list <CategoryParameterDTO>parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CategoryContentParametersDTO_H_ */
