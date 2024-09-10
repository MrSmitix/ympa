/*
 * CategoryDTO.h
 *
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */

#ifndef _CategoryDTO_H_
#define _CategoryDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 *
 *  \ingroup Models
 *
 */

class CategoryDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CategoryDTO();
	CategoryDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CategoryDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор категории.
	 */
	long long getId();

	/*! \brief Set Идентификатор категории.
	 */
	void setId(long long  id);
	/*! \brief Get Название категории.
	 */
	std::string getName();

	/*! \brief Set Название категории.
	 */
	void setName(std::string  name);
	/*! \brief Get Дочерние категории.
	 */
	std::list<CategoryDTO> getChildren();

	/*! \brief Set Дочерние категории.
	 */
	void setChildren(std::list <CategoryDTO> children);

private:
	long long id;
	std::string name;
	std::list <CategoryDTO>children;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CategoryDTO_H_ */
