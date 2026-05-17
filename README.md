# ಕಲಾವಿದರ ಬಳಗ — Kalavidara-Balaga

> **A Folk Artist Talent Hub** — Connecting Karnataka's traditional performing troupes with urban event managers.

---

## 🥁 The Problem

Karnataka's traditional folk art troupes — **Dollu Kunitha, Pooja Kunitha, Goravara Kunitha** — only get hired during wedding or festival seasons. For the rest of the year, these artists are forced into daily wage labour. There is **no digital bridge** between rural folk talent and city-based event planners who are actively looking for authentic performers.

---

## 💡 The Solution

**Kalavidara-Balaga** is a professional Android marketplace where every troupe builds a **Performance Profile** — complete with photos, art form, instruments, service area, and a one-tap booking contact. It transforms traditional art from a seasonal side-gig into a **sustainable profession**.

---

## 📱 Key Features

| Feature | Description |
|---|---|
| 🎭 Troupe Profiles | Group photo, lead contact, art form, district |
| 🖼️ Portfolio Gallery | Staggered photo grid with performance media |
| 📞 One-Tap Booking | Direct call to troupe via Android Intent |
| 🥁 Equipment List | Drums, sound systems, troupe size |
| 🔍 Artist Search | Filter by District and Art Type |
| ⚡ Fast Loading | Optimised for slow/rural network conditions |

---

## 🛠️ Technologies Used

### Frontend (Android)
- **Language:** Java / Kotlin
- **UI Components:** RecyclerView with `StaggeredGridLayoutManager`
- **Navigation:** Android Intents (for call feature)
- **Design:** Material Design 3 — vibrant traditional Karnataka textures and colour palette

### Backend & Database
- **Firebase Firestore** — Real-time searchable artist directory
- **Firebase Storage** — Photo and media hosting
- **Firebase Authentication** — Troupe/admin login

### AI / GenAI Integration
- **Google Gemini API** — Smart search suggestions and auto-tagging of art forms
- **GenAI-assisted Profile Builder** — Helps troupes describe their act in Kannada and English

### Tools & DevOps
- **Android Studio** — Primary IDE
- **Gradle** — Build system
- **GitHub** — Version control

---

## 🗂️ Project Structure

```
Kalavidara-Balaga/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/kalavidara/
│   │   │   │   ├── ui/             # Activities & Fragments
│   │   │   │   ├── adapter/        # RecyclerView Adapters
│   │   │   │   ├── model/          # Data Models (Troupe, Artist)
│   │   │   │   ├── repository/     # Firestore Data Layer
│   │   │   │   └── utils/          # Helpers & Constants
│   │   │   ├── res/
│   │   │   │   ├── layout/         # XML Layouts
│   │   │   │   ├── drawable/       # Traditional textures & icons
│   │   │   │   └── values/         # Colours, Strings, Themes
│   │   │   └── AndroidManifest.xml
├── README.md
└── .gitignore
```

---



> ⚠️ **Never commit `google-services.json`** — it is listed in `.gitignore`

---

## 🎯 Success Criteria

- [x] Artist Search filters by **District** and **Art Type**
- [x] Troupe profiles load quickly on **slow/2G networks**
- [x] UI uses **vibrant traditional Karnataka textures**
- [x] One-tap **Call Intent** for direct booking
- [x] Gallery uses **StaggeredGridLayout**

---

## 🌍 Impact Goals

- **Cultural Preservation** — Making folk arts financially viable for Karnataka's youth
- **Creative Economy** — Connecting rural talent with the urban event market
- **Soft Power** — Showcasing the rich diversity of Karnataka's performance traditions




## 📄 License

This project is developed for academic purposes under Sairam College of Engineering.
