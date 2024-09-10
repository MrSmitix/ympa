
/*
 * QualityRatingDTO.h
 *
 * Информация об индексе качества.
 */

#ifndef TINY_CPP_CLIENT_QualityRatingDTO_H_
#define TINY_CPP_CLIENT_QualityRatingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "QualityRatingComponentDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об индексе качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingDTO{
public:

    /*! \brief Constructor.
	 */
    QualityRatingDTO();
    QualityRatingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QualityRatingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Значение индекса качества.
	 */
	long getRating();

	/*! \brief Set Значение индекса качества.
	 */
	void setRating(long  rating);
	/*! \brief Get Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	Date getCalculationDate();

	/*! \brief Set Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	void setCalculationDate(Date  calculationDate);
	/*! \brief Get Составляющие индекса качества.
	 */
	std::list<QualityRatingComponentDTO> getComponents();

	/*! \brief Set Составляющие индекса качества.
	 */
	void setComponents(std::list <QualityRatingComponentDTO> components);


    private:
    long rating{};
    Date calculationDate;
    std::list<QualityRatingComponentDTO> components;
};
}

#endif /* TINY_CPP_CLIENT_QualityRatingDTO_H_ */
