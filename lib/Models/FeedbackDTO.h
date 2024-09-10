
/*
 * FeedbackDTO.h
 *
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */

#ifndef TINY_CPP_CLIENT_FeedbackDTO_H_
#define TINY_CPP_CLIENT_FeedbackDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackAuthorDTO.h"
#include "FeedbackCommentDTO.h"
#include "FeedbackGradesDTO.h"
#include "FeedbackOrderDTO.h"
#include "FeedbackShopDTO.h"
#include "FeedbackStateType.h"
#include <list>

namespace Tiny {


/*! \brief Отзыв пользователя Яндекс Маркета об указанном магазине.
 *
 *  \ingroup Models
 *
 */

class FeedbackDTO{
public:

    /*! \brief Constructor.
	 */
    FeedbackDTO();
    FeedbackDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор отзыва.
	 */
	long getId();

	/*! \brief Set Идентификатор отзыва.
	 */
	void setId(long  id);
	/*! \brief Get Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	std::string getCreatedAt();

	/*! \brief Set Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Комментарий автора отзыва.
	 */
	std::string getText();

	/*! \brief Set Комментарий автора отзыва.
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	FeedbackStateType getState();

	/*! \brief Set 
	 */
	void setState(FeedbackStateType  state);
	/*! \brief Get 
	 */
	FeedbackAuthorDTO getAuthor();

	/*! \brief Set 
	 */
	void setAuthor(FeedbackAuthorDTO  author);
	/*! \brief Get Достоинства магазина, описанные в отзыве.
	 */
	std::string getPro();

	/*! \brief Set Достоинства магазина, описанные в отзыве.
	 */
	void setPro(std::string  pro);
	/*! \brief Get Недостатки магазина, описанные в отзыве.
	 */
	std::string getContra();

	/*! \brief Set Недостатки магазина, описанные в отзыве.
	 */
	void setContra(std::string  contra);
	/*! \brief Get Переписка автора отзыва с магазином.
	 */
	std::list<FeedbackCommentDTO> getComments();

	/*! \brief Set Переписка автора отзыва с магазином.
	 */
	void setComments(std::list <FeedbackCommentDTO> comments);
	/*! \brief Get 
	 */
	FeedbackShopDTO getShop();

	/*! \brief Set 
	 */
	void setShop(FeedbackShopDTO  shop);
	/*! \brief Get Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
	 */
	bool isResolved();

	/*! \brief Set Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
	 */
	void setResolved(bool  resolved);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
	 */
	bool isVerified();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
	 */
	void setVerified(bool  verified);
	/*! \brief Get Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
	 */
	bool isRecommend();

	/*! \brief Set Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
	 */
	void setRecommend(bool  recommend);
	/*! \brief Get 
	 */
	FeedbackGradesDTO getGrades();

	/*! \brief Set 
	 */
	void setGrades(FeedbackGradesDTO  grades);
	/*! \brief Get 
	 */
	FeedbackOrderDTO getOrder();

	/*! \brief Set 
	 */
	void setOrder(FeedbackOrderDTO  order);


    private:
    long id{};
    std::string createdAt{};
    std::string text{};
    FeedbackStateType state;
    FeedbackAuthorDTO author;
    std::string pro{};
    std::string contra{};
    std::list<FeedbackCommentDTO> comments;
    FeedbackShopDTO shop;
    bool resolved{};
    bool verified{};
    bool recommend{};
    FeedbackGradesDTO grades;
    FeedbackOrderDTO order;
};
}

#endif /* TINY_CPP_CLIENT_FeedbackDTO_H_ */
