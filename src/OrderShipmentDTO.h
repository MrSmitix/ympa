/*
 * OrderShipmentDTO.h
 *
 * Список посылок.  В параметре может указываться несколько посылок. 
 */

#ifndef _OrderShipmentDTO_H_
#define _OrderShipmentDTO_H_


#include <string>
#include "OrderParcelBoxDTO.h"
#include "OrderTrackDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список посылок.  В параметре может указываться несколько посылок. 
 *
 *  \ingroup Models
 *
 */

class OrderShipmentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderShipmentDTO();
	OrderShipmentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderShipmentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор посылки, присвоенный Маркетом.
	 */
	long long getId();

	/*! \brief Set Идентификатор посылки, присвоенный Маркетом.
	 */
	void setId(long long  id);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getShipmentDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setShipmentDate(std::string  shipmentDate);
	/*! \brief Get **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
	 */
	std::string getShipmentTime();

	/*! \brief Set **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
	 */
	void setShipmentTime(std::string  shipmentTime);
	/*! \brief Get **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
	 */
	std::list<OrderTrackDTO> getTracks();

	/*! \brief Set **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
	 */
	void setTracks(std::list <OrderTrackDTO> tracks);
	/*! \brief Get Список грузовых мест.
	 */
	std::list<OrderParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест.
	 */
	void setBoxes(std::list <OrderParcelBoxDTO> boxes);

private:
	long long id;
	std::string shipmentDate;
	std::string shipmentTime;
	std::list <OrderTrackDTO>tracks;
	std::list <OrderParcelBoxDTO>boxes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderShipmentDTO_H_ */
