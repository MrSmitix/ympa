(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let get_orders_stats ~campaign_id ?page_token ?limit ~get_orders_stats_request_t () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/stats/orders" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let body = Request.write_as_json_body Get_orders_stats_request.to_yojson get_orders_stats_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_orders_stats_response.of_yojson) resp body

