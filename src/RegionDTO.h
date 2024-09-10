/*
 * RegionDTO.h
 *
 * Регион доставки.
 */

#ifndef _RegionDTO_H_
#define _RegionDTO_H_


#include <string>
#include "RegionType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Регион доставки.
 *
 *  \ingroup Models
 *
 */

class RegionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	RegionDTO();
	RegionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RegionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор региона.
	 */
	long long getId();

	/*! \brief Set Идентификатор региона.
	 */
	void setId(long long  id);
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
	long long id;
	std::string name;
	RegionType type;
	RegionDTO parent;
	std::list <RegionDTO>children;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RegionDTO_H_ */
