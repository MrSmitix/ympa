
/*
 * FeedbackGradesDTO.h
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

#ifndef TINY_CPP_CLIENT_FeedbackGradesDTO_H_
#define TINY_CPP_CLIENT_FeedbackGradesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackFactorDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 *
 *  \ingroup Models
 *
 */

class FeedbackGradesDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackGradesDTO();
    FeedbackGradesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackGradesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
	 */
	long getAverage();

	/*! \brief Set Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
	 */
	void setAverage(long  average);
	/*! \brief Get Количество пользователей, считающих отзыв полезным.
	 */
	long getAgreeCount();

	/*! \brief Set Количество пользователей, считающих отзыв полезным.
	 */
	void setAgreeCount(long  agreeCount);
	/*! \brief Get Количество пользователей, считающих отзыв бесполезным.
	 */
	long getRejectCount();

	/*! \brief Set Количество пользователей, считающих отзыв бесполезным.
	 */
	void setRejectCount(long  rejectCount);
	/*! \brief Get Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
	 */
	std::list<FeedbackFactorDTO> getFactors();

	/*! \brief Set Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
	 */
	void setFactors(std::list <FeedbackFactorDTO> factors);


    private:
    long average{};
    long agreeCount{};
    long rejectCount{};
    std::list<FeedbackFactorDTO> factors;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackGradesDTO_H_ */
