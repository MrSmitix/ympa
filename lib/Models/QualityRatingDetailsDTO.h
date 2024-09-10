
/*
 * QualityRatingDetailsDTO.h
 *
 * Информация о заказах, которые повлияли на индекс качества.
 */

#ifndef TINY_CPP_CLIENT_QualityRatingDetailsDTO_H_
#define TINY_CPP_CLIENT_QualityRatingDetailsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "QualityRatingAffectedOrderDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о заказах, которые повлияли на индекс качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingDetailsDTO{
public:

    /*! \brief Constructor.
	 */
    QualityRatingDetailsDTO();
    QualityRatingDetailsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityRatingDetailsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список заказов, которые повлияли на индекс качества.
	 */
	std::list<QualityRatingAffectedOrderDTO> getAffectedOrders();

	/*! \brief Set Список заказов, которые повлияли на индекс качества.
	 */
	void setAffectedOrders(std::list <QualityRatingAffectedOrderDTO> affectedOrders);


    private:
    std::list<QualityRatingAffectedOrderDTO> affectedOrders;
};
}

#endif /* TINY_CPP_CLIENT_QualityRatingDetailsDTO_H_ */
