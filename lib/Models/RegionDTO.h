
/*
 * RegionDTO.h
 *
 * Регион доставки.
 */

#ifndef TINY_CPP_CLIENT_RegionDTO_H_
#define TINY_CPP_CLIENT_RegionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RegionType.h"
#include <list>

namespace Tiny {


/*! \brief Регион доставки.
 *
 *  \ingroup Models
 *
 */

class RegionDTO{
public:

    /*! \brief Constructor.
	 */
    RegionDTO();
    RegionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RegionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор региона.
	 */
	long getId();

	/*! \brief Set Идентификатор региона.
	 */
	void setId(long  id);
	/*! \brief Get Название региона.
	 */
	std::string getName();

	/*! \brief Set Название региона.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RegionType getType();

	/*! \brief Set 
	 */
	void setType(RegionType  type);
	/*! \brief Get 
	 */
	RegionDTO getParent();

	/*! \brief Set 
	 */
	void setParent(RegionDTO  parent);
	/*! \brief Get Дочерние регионы.
	 */
	std::list<RegionDTO> getChildren();

	/*! \brief Set Дочерние регионы.
	 */
	void setChildren(std::list <RegionDTO> children);


    private:
    long id{};
    std::string name{};
    RegionType type;
    RegionDTO parent;
    std::list<RegionDTO> children;
};
}

#endif /* TINY_CPP_CLIENT_RegionDTO_H_ */
