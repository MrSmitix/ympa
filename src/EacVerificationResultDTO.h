/*
 * EacVerificationResultDTO.h
 *
 * Результат выполнения запроса.
 */

#ifndef _EacVerificationResultDTO_H_
#define _EacVerificationResultDTO_H_


#include <string>
#include "EacVerificationStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат выполнения запроса.
 *
 *  \ingroup Models
 *
 */

class EacVerificationResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	EacVerificationResultDTO();
	EacVerificationResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EacVerificationResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	EacVerificationStatusType getVerificationResult();

	/*! \brief Set 
	 */
	void setVerificationResult(EacVerificationStatusType  verificationResult);
	/*! \brief Get Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
	 */
	int getAttemptsLeft();

	/*! \brief Set Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
	 */
	void setAttemptsLeft(int  attemptsLeft);

private:
	EacVerificationStatusType verificationResult;
	int attemptsLeft;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EacVerificationResultDTO_H_ */
