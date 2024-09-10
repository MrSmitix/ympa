/*
 * GoodsFeedbackDescriptionDTO.h
 *
 * Текстовая часть отзыва.
 */

#ifndef _GoodsFeedbackDescriptionDTO_H_
#define _GoodsFeedbackDescriptionDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Текстовая часть отзыва.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackDescriptionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackDescriptionDTO();
	GoodsFeedbackDescriptionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackDescriptionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string advantages;
	std::string disadvantages;
	std::string comment;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackDescriptionDTO_H_ */
