(ns app.view.reagent-mui
  (:refer-clojure :exclude [list])
  (:require
   ["@material-ui/core" :as mui]
   ["@material-ui/icons" :as ic]
   ["@material-ui/icons/FileCopy" :default CopyIcon]))

"Shim for reagent mui"

(defn card [& props]
  (into [:> mui/Card] props))

(defn card-header [& props]
  (into [:> mui/CardHeader] props))

(defn card-media [& props]
  (into [:> mui/CardMedia] props))

(defn card-actions [& props]
  (into [:> mui/CardActions] props))

(defn card-text [& props]
  (into [:> mui/CardText] props))

(defn list [& props]
  (into [:> mui/List] props))

(defn list-item [& props]
  (into [:> mui/ListItem] props))

(defn snackbar [ & props]
  (into [:> mui/Snackbar] props))

(defn floating-action-button [& props]
  (into [:> mui/Button] props))

(defn raised-button [& props]
  (into [:> mui/Button] props))

(defn flat-button [& props]
  (into [:> mui/Button] props))

(defn dialog [& props]
  (into [:> mui/Dialog]
    props))

(defn subheader [& props]
  (into [:> mui/Subheader] props))

(defn select-field [& props]
  (into [:> mui/Select] props))

(defn menu-item [& props]
  (into [:> mui/MenuItem] props))

(defn badge [& props]
  (into [:> mui/Badge] props))