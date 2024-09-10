
/*
 * TurnoverDTO.h
 *
 * Информация об оборачиваемости товара.
 */

#ifndef TINY_CPP_CLIENT_TurnoverDTO_H_
#define TINY_CPP_CLIENT_TurnoverDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TurnoverType.h"

namespace Tiny {


/*! \brief Информация об оборачиваемости товара.
 *
 *  \ingroup Models
 *
 */

class TurnoverDTO{
public:

    /*! \brief Constructor.
	 */
    TurnoverDTO();
    TurnoverDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TurnoverDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TurnoverType getTurnover();

	/*! \brief Set 
	 */
	void setTurnover(TurnoverType  turnover);
	/*! \brief Get Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
	 */
	double getTurnoverDays();

	/*! \brief Set Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
	 */
	void setTurnoverDays(double  turnoverDays);


    private:
    TurnoverType turnover;
    double turnoverDays{};
};
}

#endif /* TINY_CPP_CLIENT_TurnoverDTO_H_ */
