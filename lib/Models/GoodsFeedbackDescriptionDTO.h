
/*
 * GoodsFeedbackDescriptionDTO.h
 *
 * Текстовая часть отзыва.
 */

#ifndef TINY_CPP_CLIENT_GoodsFeedbackDescriptionDTO_H_
#define TINY_CPP_CLIENT_GoodsFeedbackDescriptionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Текстовая часть отзыва.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackDescriptionDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsFeedbackDescriptionDTO();
    GoodsFeedbackDescriptionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsFeedbackDescriptionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Описание плюсов товара в отзыве.
	 */
	std::string getAdvantages();

	/*! \brief Set Описание плюсов товара в отзыве.
	 */
	void setAdvantages(std::string  advantages);
	/*! \brief Get Описание минусов товара в отзыве.
	 */
	std::string getDisadvantages();

	/*! \brief Set Описание минусов товара в отзыве.
	 */
	void setDisadvantages(std::string  disadvantages);
	/*! \brief Get Комментарий в отзыве.
	 */
	std::string getComment();

	/*! \brief Set Комментарий в отзыве.
	 */
	void setComment(std::string  comment);


    private:
    std::string advantages{};
    std::string disadvantages{};
    std::string comment{};
};
}

#endif /* TINY_CPP_CLIENT_GoodsFeedbackDescriptionDTO_H_ */
