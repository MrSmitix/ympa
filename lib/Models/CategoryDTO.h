
/*
 * CategoryDTO.h
 *
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 */

#ifndef TINY_CPP_CLIENT_CategoryDTO_H_
#define TINY_CPP_CLIENT_CategoryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 *
 *  \ingroup Models
 *
 */

class CategoryDTO{
public:

    /*! \brief Constructor.
	 */
    CategoryDTO();
    CategoryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор категории.
	 */
	long getId();

	/*! \brief Set Идентификатор категории.
	 */
	void setId(long  id);
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
    long id{};
    std::string name{};
    std::list<CategoryDTO> children;
};
}

#endif /* TINY_CPP_CLIENT_CategoryDTO_H_ */
