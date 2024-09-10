(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let add_hidden_offers ~campaign_id ~add_hidden_offers_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/hidden-offers" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let body = Request.write_as_json_body Add_hidden_offers_request.to_yojson add_hidden_offers_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

let delete_hidden_offers ~campaign_id ~delete_hidden_offers_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/hidden-offers/delete" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let body = Request.write_as_json_body Delete_hidden_offers_request.to_yojson delete_hidden_offers_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

let get_hidden_offers ~campaign_id ?(offer_id = []) ?page_token ?limit ?offset ?(page = 11l) ?page_size () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/hidden-offers" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.add_query_param_list uri "offer_id" (List.map (fun x -> x)) offer_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let uri = Request.maybe_add_query_param uri "offset" Int32.to_string offset in
    let uri = Request.add_query_param uri "page" Int32.to_string page in
    let uri = Request.maybe_add_query_param uri "pageSize" Int32.to_string page_size in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_hidden_offers_response.of_yojson) resp body

