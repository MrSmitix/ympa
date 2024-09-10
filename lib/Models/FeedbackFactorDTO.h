
/*
 * FeedbackFactorDTO.h
 *
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackFactorDTO_H_
#define TINY_CPP_CLIENT_FeedbackFactorDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 *
 *  \ingroup Models
 *
 */

class FeedbackFactorDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackFactorDTO();
    FeedbackFactorDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackFactorDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор параметра.
	 */
	long getId();

	/*! \brief Set Идентификатор параметра.
	 */
	void setId(long  id);
	/*! \brief Get Название параметра. Например, `Скорость обработки заказа`.
	 */
	std::string getTitle();

	/*! \brief Set Название параметра. Например, `Скорость обработки заказа`.
	 */
	void setTitle(std::string  title);
	/*! \brief Get Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
	 */
	std::string getDescription();

	/*! \brief Set Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
	 */
	int getValue();

	/*! \brief Set Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
	 */
	void setValue(int  value);


    private:
    long id{};
    std::string title{};
    std::string description{};
    int value{};
};
}

#endif /* TINY_CPP_CLIENT_FeedbackFactorDTO_H_ */
