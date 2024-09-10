(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let confirm_business_prices ~business_id ~confirm_prices_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/price-quarantine/confirm" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let body = Request.write_as_json_body Confirm_prices_request.to_yojson confirm_prices_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

let confirm_campaign_prices ~campaign_id ~confirm_prices_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/price-quarantine/confirm" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let body = Request.write_as_json_body Confirm_prices_request.to_yojson confirm_prices_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

let get_business_quarantine_offers ~business_id ~get_quarantine_offers_request_t ?page_token ?limit () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/price-quarantine" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let body = Request.write_as_json_body Get_quarantine_offers_request.to_yojson get_quarantine_offers_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_quarantine_offers_response.of_yojson) resp body

let get_campaign_quarantine_offers ~campaign_id ~get_quarantine_offers_request_t ?page_token ?limit () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/price-quarantine" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let body = Request.write_as_json_body Get_quarantine_offers_request.to_yojson get_quarantine_offers_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_quarantine_offers_response.of_yojson) resp body

