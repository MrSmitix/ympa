(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let generate_order_label ~campaign_id ~order_id ~shipment_id ~box_id ?format () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.replace_path_param uri "orderId" Int64.to_string order_id in
    let uri = Request.replace_path_param uri "shipmentId" Int64.to_string shipment_id in
    let uri = Request.replace_path_param uri "boxId" Int64.to_string box_id in
    let uri = Request.maybe_add_query_param uri "format"  format in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.to_string) resp body

let generate_order_labels ~campaign_id ~order_id ?format () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/orders/{orderId}/delivery/labels" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.replace_path_param uri "orderId" Int64.to_string order_id in
    let uri = Request.maybe_add_query_param uri "format"  format in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.to_string) resp body

let get_order_labels_data ~campaign_id ~order_id =
    let open Lwt.Infix in
    let uri = Request.build_uri "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "campaignId" Int64.to_string campaign_id in
    let uri = Request.replace_path_param uri "orderId" Int64.to_string order_id in
    Cohttp_lwt_unix.Client.call `GET uri ~headers >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_order_labels_data_response.of_yojson) resp body

