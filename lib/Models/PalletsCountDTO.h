
/*
 * PalletsCountDTO.h
 *
 * Количество палет в отгрузке.
 */

#ifndef TINY_CPP_CLIENT_PalletsCountDTO_H_
#define TINY_CPP_CLIENT_PalletsCountDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Количество палет в отгрузке.
 *
 *  \ingroup Models
 *
 */

class PalletsCountDTO{
public:

    /*! \brief Constructor.
	 */
    PalletsCountDTO();
    PalletsCountDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PalletsCountDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество палет, которое заявил продавец.
	 */
	int getPlanned();

	/*! \brief Set Количество палет, которое заявил продавец.
	 */
	void setPlanned(int  planned);
	/*! \brief Get Количество палет, которое приняли в сортировочном центре.
	 */
	int getFact();

	/*! \brief Set Количество палет, которое приняли в сортировочном центре.
	 */
	void setFact(int  fact);


    private:
    int planned{};
    int fact{};
};
}

#endif /* TINY_CPP_CLIENT_PalletsCountDTO_H_ */
