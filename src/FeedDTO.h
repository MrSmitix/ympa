/*
 * FeedDTO.h
 *
 * Информация о прайс-листе.
 */

#ifndef _FeedDTO_H_
#define _FeedDTO_H_


#include <string>
#include "FeedContentDTO.h"
#include "FeedDownloadDTO.h"
#include "FeedPlacementDTO.h"
#include "FeedPublicationDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о прайс-листе.
 *
 *  \ingroup Models
 *
 */

class FeedDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedDTO();
	FeedDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор прайс-листа.
	 */
	long long getId();

	/*! \brief Set Идентификатор прайс-листа.
	 */
	void setId(long long  id);
	/*! \brief Get Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	 */
	std::string getLogin();

	/*! \brief Set Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	 */
	void setLogin(std::string  login);
	/*! \brief Get Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
	 */
	std::string getName();

	/*! \brief Set Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
	 */
	void setName(std::string  name);
	/*! \brief Get Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	 */
	std::string getPassword();

	/*! \brief Set Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
	 */
	void setPassword(std::string  password);
	/*! \brief Get Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
	 */
	std::string getUploadDate();

	/*! \brief Set Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
	 */
	void setUploadDate(std::string  uploadDate);
	/*! \brief Get URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
	 */
	std::string getUrl();

	/*! \brief Set URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	FeedContentDTO getContent();

	/*! \brief Set 
	 */
	void setContent(FeedContentDTO  content);
	/*! \brief Get 
	 */
	FeedDownloadDTO getDownload();

	/*! \brief Set 
	 */
	void setDownload(FeedDownloadDTO  download);
	/*! \brief Get 
	 */
	FeedPlacementDTO getPlacement();

	/*! \brief Set 
	 */
	void setPlacement(FeedPlacementDTO  placement);
	/*! \brief Get 
	 */
	FeedPublicationDTO getPublication();

	/*! \brief Set 
	 */
	void setPublication(FeedPublicationDTO  publication);

private:
	long long id;
	std::string login;
	std::string name;
	std::string password;
	std::string uploadDate;
	std::string url;
	FeedContentDTO content;
	FeedDownloadDTO download;
	FeedPlacementDTO placement;
	FeedPublicationDTO publication;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedDTO_H_ */
