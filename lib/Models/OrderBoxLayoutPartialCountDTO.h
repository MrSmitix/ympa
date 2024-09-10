
/*
 * OrderBoxLayoutPartialCountDTO.h
 *
 * Информация о части товара в коробке.
 */

#ifndef TINY_CPP_CLIENT_OrderBoxLayoutPartialCountDTO_H_
#define TINY_CPP_CLIENT_OrderBoxLayoutPartialCountDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о части товара в коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutPartialCountDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBoxLayoutPartialCountDTO();
    OrderBoxLayoutPartialCountDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBoxLayoutPartialCountDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Номер части, начиная с 1.
	 */
	int getCurrent();

	/*! \brief Set Номер части, начиная с 1.
	 */
	void setCurrent(int  current);
	/*! \brief Get На сколько всего частей разделен товар.
	 */
	int getTotal();

	/*! \brief Set На сколько всего частей разделен товар.
	 */
	void setTotal(int  total);


    private:
    int current{};
    int total{};
};
}

#endif /* TINY_CPP_CLIENT_OrderBoxLayoutPartialCountDTO_H_ */
