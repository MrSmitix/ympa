/*
 * OutletLicenseDTO.h
 *
 * Информация о лицензии.
 */

#ifndef _OutletLicenseDTO_H_
#define _OutletLicenseDTO_H_


#include <string>
#include "LicenseType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о лицензии.
 *
 *  \ingroup Models
 *
 */

class OutletLicenseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletLicenseDTO();
	OutletLicenseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletLicenseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
	 */
	long long getId();

	/*! \brief Set Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
	 */
	void setId(long long  id);
	/*! \brief Get Идентификатор точки продаж, для которой действительна лицензия.
	 */
	long long getOutletId();

	/*! \brief Set Идентификатор точки продаж, для которой действительна лицензия.
	 */
	void setOutletId(long long  outletId);
	/*! \brief Get 
	 */
	LicenseType getLicenseType();

	/*! \brief Set 
	 */
	void setLicenseType(LicenseType  licenseType);
	/*! \brief Get Номер лицензии.
	 */
	std::string getNumber();

	/*! \brief Set Номер лицензии.
	 */
	void setNumber(std::string  number);
	/*! \brief Get Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
	 */
	std::string getDateOfIssue();

	/*! \brief Set Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
	 */
	void setDateOfIssue(std::string  dateOfIssue);
	/*! \brief Get Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
	 */
	std::string getDateOfExpiry();

	/*! \brief Set Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
	 */
	void setDateOfExpiry(std::string  dateOfExpiry);

private:
	long long id;
	long long outletId;
	LicenseType licenseType;
	std::string number;
	std::string dateOfIssue;
	std::string dateOfExpiry;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletLicenseDTO_H_ */
