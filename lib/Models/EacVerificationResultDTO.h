
/*
 * EacVerificationResultDTO.h
 *
 * Результат выполнения запроса.
 */

#ifndef TINY_CPP_CLIENT_EacVerificationResultDTO_H_
#define TINY_CPP_CLIENT_EacVerificationResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EacVerificationStatusType.h"

namespace Tiny {


/*! \brief Результат выполнения запроса.
 *
 *  \ingroup Models
 *
 */

class EacVerificationResultDTO{
public:

    /*! \brief Constructor.
	 */
    EacVerificationResultDTO();
    EacVerificationResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EacVerificationResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int attemptsLeft{};
};
}

#endif /* TINY_CPP_CLIENT_EacVerificationResultDTO_H_ */
