(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

val get_order_buyer_info : campaign_id:int64 -> order_id:int64 -> Get_order_buyer_info_response.t Lwt.t
val set_order_delivery_date : campaign_id:int64 -> order_id:int64 -> set_order_delivery_date_request_t:Set_order_delivery_date_request.t -> Empty_api_response.t Lwt.t
val set_order_delivery_track_code : campaign_id:int64 -> order_id:int64 -> set_order_delivery_track_code_request_t:Set_order_delivery_track_code_request.t -> Empty_api_response.t Lwt.t
val update_order_storage_limit : campaign_id:int64 -> order_id:int64 -> update_order_storage_limit_request_t:Update_order_storage_limit_request.t -> Empty_api_response.t Lwt.t
val verify_order_eac : campaign_id:int64 -> order_id:int64 -> verify_order_eac_request_t:Verify_order_eac_request.t -> Verify_order_eac_response.t Lwt.t
