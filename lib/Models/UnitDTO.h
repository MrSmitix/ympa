
/*
 * UnitDTO.h
 *
 * Единица измерения.
 */

#ifndef TINY_CPP_CLIENT_UnitDTO_H_
#define TINY_CPP_CLIENT_UnitDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Единица измерения.
 *
 *  \ingroup Models
 *
 */

class UnitDTO{
public:

    /*! \brief Constructor.
	 */
    UnitDTO();
    UnitDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UnitDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор единицы измерения.
	 */
	long getId();

	/*! \brief Set Идентификатор единицы измерения.
	 */
	void setId(long  id);
	/*! \brief Get Сокращенное название единицы измерения.
	 */
	std::string getName();

	/*! \brief Set Сокращенное название единицы измерения.
	 */
	void setName(std::string  name);
	/*! \brief Get Полное название единицы измерения.
	 */
	std::string getFullName();

	/*! \brief Set Полное название единицы измерения.
	 */
	void setFullName(std::string  fullName);


    private:
    long id{};
    std::string name{};
    std::string fullName{};
};
}

#endif /* TINY_CPP_CLIENT_UnitDTO_H_ */
